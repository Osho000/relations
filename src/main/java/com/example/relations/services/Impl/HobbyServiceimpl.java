package com.example.relations.services.Impl;

import com.example.relations.DTO.HobbyDTO;
import com.example.relations.entity.Hobby;
import com.example.relations.repositories.HobbyRepository;
import com.example.relations.services.HobbyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class HobbyServiceimpl implements HobbyService {
    private final HobbyRepository hobbyRepository;
    @Override
    public HobbyDTO create(HobbyDTO hobby) {

    }

    @Override
    public HobbyDTO findById(Long id) {
        return hobbyRepository.findByName(id).map(Hobby.builder().type(id).build())
    }

    @Override
    public List<HobbyDTO> getAll() {
        return hobbyRepository.findAll().stream().map(Hobby.builder().type())
    }

    @Override
    public HobbyDTO update(Long id, HobbyDTO hobby) {
        Hobby existHobby = hobbyRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Hobby not found"));
        existHobby.setType(hobby.type());
        return Hobby.builder().type(hobby)
    }

    @Override
    public void delete(Long id) {
        hobbyRepository.deleteById(id);
    }
}
