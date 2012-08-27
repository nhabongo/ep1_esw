package br.edu.usp.pedido.controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.usp.pedido.domain.Item;
import br.edu.usp.pedido.domain.Pedido;
import br.edu.usp.pedido.infra.dao.PedidoDao;

@Resource
public class PedidoController {
	
	private final PedidoDao dao;
	private final Result result;

	public PedidoController(PedidoDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	@Path("/")
	public void inicio(){
		result.include("variable", "uirrrc");
	}
	
	@Path("lista")
	public List<Pedido> lista(){
		return dao.listaPedido();
	}
	
	@Path("/novo")
	public void novo(){
		
	}
	
	@Path("detalhes")
	public List<Item> detalhes(Long id){
		Pedido tmp = dao.detalhePedido(id);
		result.include("client", tmp.getClient());
		result.include("date", tmp.getDate());
		result.include("cost", tmp.calculaValorTotal());
		result.include("amount", tmp.numeroDeItems());
		return tmp.getOrders();
	}
	
	@Post
	@Path("/salva")
	public void salva(Pedido pedido, List<Item> item){
		pedido.setOrders(item);
		dao.salva(pedido);
		this.result.redirectTo(this).novo();
	}
}
