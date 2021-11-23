package gumbert.humbert.bestwatching.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "message")
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "senderId")
    private User sender;
    @ManyToOne
    @JoinColumn(name = "receiverId")
    private User receiver;
    private String text;
}
