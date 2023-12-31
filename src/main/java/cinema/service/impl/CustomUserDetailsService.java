package cinema.service.impl;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.UserService;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Optional<User> optionalUser = userService.findByEmail(username);
        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }
        User user = optionalUser.get();
        org.springframework.security.core.userdetails.User.UserBuilder builder =
                org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.getPassword());
        builder.authorities(user.getRoles().stream()
                .map(Role::getName)
                .map(Enum::name)
                .toArray(String[]::new));
        return builder.build();
    }
}
