package Smallcare.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetComment {


    @Id
    private Long id;

    @Column(name = "comment", nullable = false)
    private String comment;
}
