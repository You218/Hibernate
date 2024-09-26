package crud;

import crud.entities.Users;

import javax.persistence.*;

public class Main {
    ;
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Users user = new Users();
            user.setName("Rishabh");
            user.setPassword("yo");
            user.setEmail("rishabh@gmail.com");
            user.setPhone("123456789");

            em.persist(user);

            em.getTransaction().commit();
        }finally {
            em.close();
        }


    }
}