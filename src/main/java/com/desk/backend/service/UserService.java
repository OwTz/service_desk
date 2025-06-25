package com.desk.backend.service;



import com.desk.backend.models.Usuarios;
import com.desk.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsuarioRepository query;

    public List<Usuarios> allUsers(){
        return query.findAll();
    }

    public Usuarios addUser(Usuarios user) {
        try {
            return query.save(user);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar usuário: " + e.getMessage());
            return null;
        }
    }

    public Optional<Usuarios> findById(Long id){
        return query.findById(id);
    }

}
