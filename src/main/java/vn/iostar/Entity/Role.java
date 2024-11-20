package vn.iostar.Entity;

import java.io.*;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role implements Serializable {

  
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "role_name", length = 50, columnDefinition = "nvarchar(50) not null")
    private String name;
}
