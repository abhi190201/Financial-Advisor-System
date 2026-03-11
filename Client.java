package com.example.project.entities;
import javax.persistence.*;

@Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;
    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}
    public Client(String name, FinancialAdvisor advisor) { this.name = name; this.advisor = advisor; }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
