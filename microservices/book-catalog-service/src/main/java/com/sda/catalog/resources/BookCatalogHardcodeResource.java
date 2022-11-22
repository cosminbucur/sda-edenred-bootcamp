package com.sda.catalog.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sda.catalog.model.CatalogItem;
import com.sda.catalog.model.Rating;

@RequestMapping("/catalog-old")
@RestController
public class BookCatalogHardcodeResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        // get all rated books ids, call ratings-data-service
        List<Rating> ratings = Arrays.asList(
                new Rating("1111", 5),
                new Rating("2222", 4)
        );

        // get each book id, call book-info-service and get details
        return Collections.singletonList(new CatalogItem("bookId", "title", "author", 5));
    }
}
