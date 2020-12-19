package Smallcare.Services;

import Smallcare.Models.Event;
import Smallcare.Models.Pet;
import Smallcare.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    UserService userService;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }


    public Optional<Event> findById(Long id){
        return eventRepository.findById(id);
    }

    public Long save(Event event) {
        eventRepository.save(event);
        return event.getId();
    }



//    public void deleteByPetId(Long id){
////        Event event = eventRepository.findById();
//        eventRepository.deleteById();
//    }

//    public void deletePet(Pet pet) {
//        Event event = .findAll(event.getId())
//
//        event.deletePet(pet);
//        eventRepository.deleteAll();
//    }
}