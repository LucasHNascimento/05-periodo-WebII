package aplicativo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Produto;
import dominio.Venda;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			//Instancia o EntityManagerFactory com as configurações de persistencia
			emf = Persistence.createEntityManagerFactory("aula-jpa"); 
			//Intancia o EntityManager
			em = emf.createEntityManager(); 
			
			em.getTransaction().begin();
	
			// Inserir os objetos aqui!
			
			Produto objP1 = new Produto("RX 7700 XT", 3800);
			Produto objP2 = new Produto("RX 7800 XT", 4400);
			Produto objP3 = new Produto("R5 7600X", 1600);
			Produto objP4 = new Produto("b650m tuf", 1500);
			em.persist(objP1);
			em.persist(objP2);
			em.persist(objP3);
			em.persist(objP4);

			Cliente objC1 = new Cliente("Lucas");
			Cliente objC2 = new Cliente("Lucas2");
			Cliente objC3 = new Cliente("Lucas3");
			Cliente objC4 = new Cliente("Lucas4");

			Venda objV1 = new Venda(3100);
			Venda objV2 = new Venda(5900);
			Venda objV3 = new Venda(3100);
			Venda objV4 = new Venda(5300);

			objV1.setProdutos(Arrays.asList(objP3, objP4));
			objV2.setProdutos(Arrays.asList(objP2, objP4));
			objV3.setProdutos(Arrays.asList(objP1, objP3));
			objV4.setProdutos(Arrays.asList(objP1, objP4));

			objV1.setCliente(objC1);
			objV2.setCliente(objC2);
			objV3.setCliente(objC3);
			objV4.setCliente(objC4);

			objC1.setVendas(Arrays.asList(objV1));
			objC2.setVendas(Arrays.asList(objV2));
			objC3.setVendas(Arrays.asList(objV3));
			objC4.setVendas(Arrays.asList(objV4));

			em.persist(objC1);
			em.persist(objC2);
			em.persist(objC3);
			em.persist(objC4);

			em.persist(objV1);
			em.persist(objV2);
			em.persist(objV3);
			em.persist(objV4);

			Query consultaVendas = em.createQuery("select venda from Venda venda");
			ArrayList<Venda> listaVenda = (ArrayList<Venda>) consultaVendas.getResultList();

			Query consultaProdutos = em.createQuery("select produto from Produto produto");
			ArrayList<Produto> listaProduto = (ArrayList<Produto>) consultaProdutos.getResultList();

			Query consultaCliente = em.createQuery("select cliente from Cliente cliente");
			ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) consultaCliente.getResultList();

			em.getTransaction().commit();//confirmar as alterações realizadas
			
			emf.close();
			em.close();
			
			// Inserir os laços for aqui!
			
			for(Venda objV: listaVenda) {
				System.out.println(objV);
			}

			for(Produto objP: listaProduto) {
				System.out.println(objP);
			}

			for(Cliente objC: listaCliente) {
				System.out.println(objC);
			}

		}catch (Exception e){
			if(em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
			if(emf != null) {
				emf.close();
			}
		}
	}			
}
