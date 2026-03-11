package com.example.project.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne @JoinColumn(name = "client_id")
    private Client client;
    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}
    public Portfolio(Client client) { this.client = client; }
    public Long getId() { return id; }
}
