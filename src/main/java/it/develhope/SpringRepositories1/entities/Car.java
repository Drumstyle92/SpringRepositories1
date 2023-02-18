package it.develhope.SpringRepositories1.entities;

import jakarta.persistence.*;

/**
 * @author Drumstyle92
 * Entity class that contains all the characteristics of a car and is mapped to the database.
 */
@Entity
@Table
public class Car {

    /**
     * id variable representing the primary key of the table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Variable that represents the model name of the car and is mapped to a column
     */
    @Column(nullable = false)
    private String modelName;

    /**
     * Variable representing the serial number of a car and mapped to a column
     */
    @Column(nullable = false)
    private Long serialNumber;

    /**
     * Variable representing the current price of the car and mapped to a column
     */
    @Column
    private Long currentPrice;

    /**
     * Default constructor of the class it belongs to
     */
    public Car(){}

    /**
     * @param id Car id parameter
     * @param modelName Car model name parameter
     * @param serialNumber Car serial number parameter
     * @param currentPrice Current car price parameter
     * Parameterized constructor of the class it belongs to
     */
    public Car(Long id, String modelName, Long serialNumber, Long currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     * Method for encapsulation
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     * Method for encapsulation
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public Long getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber
     * Method for encapsulation
     */
    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public Long getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice
     * Method for encapsulation
     */
    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }
}
