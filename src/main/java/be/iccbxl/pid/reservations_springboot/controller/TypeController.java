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

import be.iccbxl.pid.reservations_springboot.model.Type;
import be.iccbxl.pid.reservations_springboot.service.TypeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class TypeController {
    @Autowired
    TypeService service;

    @GetMapping("/types")
    public String index2(Model model) {
        List<Type> types = service.getAll();

        model.addAttribute("types", types);
        model.addAttribute("title", "Liste des types");

        return "type/index";
    }

    @GetMapping("/types/{id}")
    public String show(Model model, @PathVariable("id") String id) {
        Type type = service.getType(id);

        model.addAttribute("type", type);
        model.addAttribute("title", "Fiche d'un type");

        return "type/show";
    }

}

