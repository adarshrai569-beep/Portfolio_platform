package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.Client;
import com.portfolio.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // CREATE or UPDATE
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // READ ALL
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // READ BY ID
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));
    }

    // DELETE
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
