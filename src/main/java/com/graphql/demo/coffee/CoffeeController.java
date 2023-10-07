/**
 * 
 */
package com.graphql.demo.coffee;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

/**
 * @author Gbenga
 *
 */
@Controller
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @Secured("ROLE_USER")
    @QueryMapping(value = "findAllCoffees")
    public List<Coffee> findAll() {
        return coffeeService.findAll();
    }

    @QueryMapping(value = "findCoffee")
    public Optional<Coffee> findOne(@Argument Integer id) {
        return coffeeService.findOne(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @MutationMapping(value = "createCoffee")
    public Coffee create(@Argument String name, @Argument Size size) {
        return coffeeService.create(name,size);
    }

    @MutationMapping(value = "updateCoffee")
    public Coffee update(@Argument Integer id, @Argument String name, @Argument Size size) {
        return coffeeService.update(id,name,size);
    }

    @MutationMapping(value = "deleteCoffee")
    public Coffee delete(@Argument Integer id) {
        return coffeeService.delete(id);
    }
}
