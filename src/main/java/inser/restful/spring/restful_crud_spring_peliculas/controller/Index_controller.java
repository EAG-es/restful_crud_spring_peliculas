/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inser.restful.spring.restful_crud_spring_peliculas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author informatica
 */
@Controller
public class Index_controller {
    /**
     * Ejemplo de controlador de inicio de aplicación
     * @param request Obtención del objeto de la peticion Http (no es obligatorio usarlo)
     * @param response Obtención del objeto de manejo la respuesta Http (no es obligatorio usarlo)
     * @return 
     */
    @GetMapping("/")
    public ModelAndView get_inicio(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("index/index");
//        modelAndView.addObject("vista", "consulta");
        return modelAndView;
    }    
}
