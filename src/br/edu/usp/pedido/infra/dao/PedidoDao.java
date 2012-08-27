package br.edu.usp.pedido.infra.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.usp.pedido.domain.Pedido;

@Component
public class PedidoDao {
	
	private final Session session;
	
	public PedidoDao() {
		this.session = NovaTransacao.getSession();
	}

 	public void salva(Pedido pedido) {
		Transaction tx = session.beginTransaction();
	    session.save(pedido);
	    tx.commit();
	}
	
 	public Pedido detalhePedido(Long id){
 		return (Pedido) session.load(Pedido.class, id);
 	}
 	
	@SuppressWarnings("unchecked")
	public List<Pedido> listaPedido() {
		return this.session.createCriteria(Pedido.class).list();
		
	}

}
