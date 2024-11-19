package com.example.projectspring.join;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    
 
    @Id
    private String id;


    @Column(nullable = false)
    private String password;
 
  
     @Column(nullable = false)
     private long phonenumber;
     

    @Column(nullable = false, unique = true)
    private String email;

}
