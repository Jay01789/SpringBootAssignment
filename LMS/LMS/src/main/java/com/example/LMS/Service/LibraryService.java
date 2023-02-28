package com.example.LMS.Service;

import com.example.LMS.Model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private final static List<Library> libraryList = new ArrayList<>();
    static int id = 0 ;
    static {
        libraryList.add(new Library(++id,"Alpha","Banglore","Fictional Books"));
        libraryList.add(new Library(++id,"Beta","Madras","Political SCiene Books"));
        libraryList.add(new Library(++id,"Charlie","HYBD","Non-Fictional Books"));
        libraryList.add(new Library(++id,"Delta","Pune","Sci-fi Books"));

    }

    public List<Library> getAll() {
        return libraryList;
    }

    public Library getByName(String name) {
       for (Library res : libraryList ){
           if(res.getName().equals(name)){
               return res ;
           }
       }
       return null ;
    }

    public void deleteById(int id) {
        libraryList.removeIf(res -> res.getId() == id);
    }

    public void addLibrary(Library library) {
        libraryList.add(library);
    }

    public String updateLibrary(Library library, String name) {
        for(Library res:libraryList){
            if(res.getName().equals(name)){
                res.setId(library.getId());
                res.setName(library.getName());
                res.setAddress(library.getAddress());
                res.setFacilities(library.getFacilities());
            }
        }
        return null;
    }
}
