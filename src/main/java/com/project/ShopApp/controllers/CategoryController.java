package com.project.ShopApp.controllers;

import com.project.ShopApp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

@RestController
@RequestMapping("api/v1/categories")
@Validated
public class CategoryController {
    //Hiển thị tất cả các categories
    @GetMapping("") //http://localhost:8080/api/v1/categories?page=1&limit=10
    public ResponseEntity<String> getAllCategories(
        @RequestParam("page") int page,
                @RequestParam("limit") int limit
        ){return ResponseEntity.ok(String.format("getAllCategories with page = %d, limit = % d",page, limit ));
}

    @PostMapping("")
    //Nếu tham số truyền vào là một đối tượng, lúc đó gọi là 1 Data Tranfer Object = Request Object
    public ResponseEntity<String> insertCategory(@Valid  @RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok("This is insertCategory" + categoryDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable Long id){
        return ResponseEntity.ok("Update Category with id=" + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id){
        return ResponseEntity.ok("Delete Category with id=" + id);
    }
}
