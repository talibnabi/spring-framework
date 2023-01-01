package com.company.springthird.controller;


import com.company.springthird.model.Line;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @RestController = @Controller + @ResponseBody
 */
//@RestController // method return type is an entity to be serialized
@Controller // method return type is a template
public class OtherController {

    // http://localhost:8099/item
    @ResponseBody // return entity will be serialized automatically: objectMapper(Line) -> Json -> String -> toTheBody
    @GetMapping("item")
    public Line handle_entity() {
        return new Line("Macbook Pro", 2500.68);
    }

    // http://localhost:8080/item2
    @GetMapping("item2")
    public ResponseEntity<Line> handle_entity2() {
        return ResponseEntity.ok(new Line("Macbook Pro", 2500.67));
    }

    // http://localhost:8080/item3
    @GetMapping("item3")
    public ResponseEntity<Line> handle_entity3() {
        // 404 - Optional.empty
        // 200 - Optional.of (non Empty)
        ResponseEntity.status(HttpStatus.CREATED).body("good");
        return ResponseEntity.of(
        Optional.of(new Line("Macbook Pro", 2500.67))
        );
    }


}
