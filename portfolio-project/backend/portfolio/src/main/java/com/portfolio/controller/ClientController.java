package com.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.entity.Client;
import com.portfolio.service.ClientService;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // CREATE
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    // READ ALL
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "Client deleted successfully";
    }
}
