package com.fss.ResourceServer.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteServiceController {

    @PostMapping("/note")
    public String createNote() {
        return "Note Created";
    }

    @GetMapping
    public String viewAllNotes() {
        return "All the available notes are!!!!!";
    }
}
