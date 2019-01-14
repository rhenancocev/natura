package net.natura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.natura.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> { 
	
	@Query("select nmPedido, dtCancelamento from Pedido where nmPedido = ?1")
	List<Pedido> findPedido(Long numeroPedido);
	
}
