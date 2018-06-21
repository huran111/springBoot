package demo.study02.entity;

import java.io.Serializable;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 17:00 2018/6/21
 * @Modified By:
 */
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;

    public Employee() {
    }

    public Employee(Integer _id, String _lastName, String _email, Integer _gender, Integer _dId) {
        this.id = _id;
        this.lastName = _lastName;
        this.email = _email;
        this.gender = _gender;
        this.dId = _dId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dId=" + dId +
                '}';
    }
}
