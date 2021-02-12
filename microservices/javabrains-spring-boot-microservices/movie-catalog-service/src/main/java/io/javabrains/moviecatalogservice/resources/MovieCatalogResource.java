package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")  //[ ] - this is not literally matching userId, this is a variable, so no matter whatever is entered is taken as a variable. This also need to be passed into method as argument using @PathVariable
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers", "Test", 4)
                // 'new CatalogItem("Transformers", "Test", 4)' -- For Java 8 and Collections.singletonList instantiation have this format
                //  new CatalogItem(name:"Transformers", desc:"Test", rating:4) -- for java 11

        );

    }


}
