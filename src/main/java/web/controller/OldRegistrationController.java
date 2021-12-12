package web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;
import web.dto.UserDto;

public class OldRegistrationController {
    // При получении запроса создает новый объект dto оторый поддерживает регистрационную форму, связывает ее и возвращает
    @GetMapping("user/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }
}
