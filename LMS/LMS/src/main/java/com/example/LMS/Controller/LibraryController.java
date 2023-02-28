package com.example.LMS.Controller;

import com.example.LMS.Model.Library;
import com.example.LMS.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/LMS")

public class LibraryController {
    @Autowired
    private LibraryService libraryService;

//    Show All (http://localhost:8080/api/v1/LMS/get-all)

    @GetMapping("/get-all")
    public List<Library> getAll(){
        return  libraryService.getAll();
    }

    //Get By Name(http://localhost:8080/api/v1/LMS/get-by/name/{name})

    @GetMapping("/get-by/name/{name}")
    public Library getbyname(@PathVariable  String name){
        return libraryService.getByName(name);
    }

    //Delete (http://localhost:8080/api/v1/LMS/delete-by/id/{id})

    @DeleteMapping("/delete-by/id/{id}")
    public void delete(@PathVariable int id){
        libraryService.deleteById(id);
    }

    //Add (localhost:8080/api/v1/LMS/add-library)
    @PostMapping("/add-library")
    public void addlibrary( @RequestBody Library library){
        libraryService.addLibrary(library);
    }


//    Update(localhost:8080/api/v1/LMS/update/name/{name})
    @PutMapping("/update/name/{name}")
    public String updatelib(@RequestBody Library library , @PathVariable String name){
        return libraryService.updateLibrary(library,name);
    }
}
