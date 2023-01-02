package com.company.springfifth.controller;


import com.company.springfifth.model.Airline;
import com.company.springfifth.model.AirlineCreateRequest;
import com.company.springfifth.model.AirlineUpdateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("airline")
public class AirlineController {

    // status: 200 - OK
    //         204 - No Content
    @GetMapping
    public ResponseEntity<List<Airline>> list(@RequestParam("query") String query) {
        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
        // 2. service call: service.list(query)
        Airline airline = new Airline();
        airline.setName(query);
        List<Airline> found = new ArrayList<>();
        found.add(airline);
        // 3. build response, add the cookie, headers, ...
        return found.isEmpty() ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.ok(found);
    }

//    @GetMapping("2")
//    public ResponseEntity<List<Airline>> list2(@RequestParam("query") String query) {
//        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
//        // 2. service call: service.list(query)
//        List<Airline> found = null;
//        // 3. build response, add the cookie, headers, ...
//        return found.isEmpty() ?
//                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
//                ResponseEntity.ok(found);
//    }

    @GetMapping("3")
    public ResponseEntity<List<Airline>> list3(@RequestParam("query") String query) {
        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
        // 2. service call: service.list(query)
        Optional<List<Airline>> found = Optional.empty();
        // 3. build response, add the cookie, headers, ...
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    // status: 201 - Created
    // wrong case: ???
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AirlineCreateRequest rq) {
        // service.create(rq)
//        throw new IllegalStateException("not implemented");
    }

    // status: 201 - Created
    // wrong case: ???
    @PostMapping("create2")
    @ResponseStatus(HttpStatus.CREATED)
    public void create2(@RequestBody Airline airline) {
        airline.setId(null); // fix to guarantee id is not provided
//         service.create(airline)
        throw new IllegalStateException("not implemented");
    }

    // status: 200 - OK
    //         404 - if id not found
    @PutMapping("{id}")
    public void modify(@PathVariable UUID id, @RequestBody AirlineUpdateRequest rq) {
        // service.modify(id, rq)
//        throw new IllegalStateException("not implemented");
    }

//    @PutMapping("{id}")
//    public void modify2(@PathVariable UUID id, @RequestBody AirlineUpdateRequest rq) {
//        // service.modify(id, rq)
//        throw new IllegalStateException("not implemented");
//    }

    // status: 200 - OK
    //         404 - if id not found
    @PutMapping("{id}")
    public void modify2(@PathVariable UUID id, @RequestBody Airline airline) {
        airline.setId(id);
        // service.modify(airline)
        throw new IllegalStateException("not implemented");
    }

    // status: 200 - OK
    //         404 - if id not found
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        // ...
        Optional<String> data = null; // service.delete(id)
        // ...
        return data.map(x -> ResponseEntity.ok().build())
                .orElseGet(() -> ResponseEntity.notFound().build());

// return ResponseEntity.of(data); // 200 vs 404
// return ResponseEntity.of(data); // 200 vs 404 - always implies body
    }

}
