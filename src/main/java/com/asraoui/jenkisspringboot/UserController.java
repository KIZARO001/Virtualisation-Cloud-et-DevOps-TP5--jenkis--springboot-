package com.asraoui.jenkisspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public Map<String, String> getUserInfo() {
        return Map.of(
                "nom", "ASRAOUI",
                "prenom", "ZAKARIA",
                "email", "z_asraoui@etu.enset-media.ac.ma",
                "Ecole", "ENSET Media",
                "Change Status","Change passed Seccusfully"

        );
    }
}
