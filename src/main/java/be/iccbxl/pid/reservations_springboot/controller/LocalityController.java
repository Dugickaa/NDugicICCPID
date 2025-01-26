package be.iccbxl.pid.reservations_springboot.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import be.iccbxl.pid.reservations_springboot.model.Locality;
import be.iccbxl.pid.reservations_springboot.service.LocalityService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Controller
public class LocalityController {
    @Autowired
    LocalityService service;

    @GetMapping("/localities")
    public String index2(Model model) {
        List<Locality> localities = service.getAll();

        model.addAttribute("localities", localities);
        model.addAttribute("title", "Liste des localités");

        return "locality/index";
    }

    @GetMapping("/localities/{id}")
    public String show(Model model, @PathVariable("id") String id) {
        Locality locality = service.get(id);

        model.addAttribute("locality", locality);
        model.addAttribute("title", "Fiche d'une localité");

        return "locality/show";
    }

}

