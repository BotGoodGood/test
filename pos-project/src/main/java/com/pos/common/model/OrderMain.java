package com.pos.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ORDER_MAIN", schema = "PUBLIC")
public class OrderMain extends BaseEntity {

	private static final long serialVersionUID = -5253041225108125299L;

	@Id
	@Column(name = "ORDER_MAIN_ID")
	@SequenceGenerator(name = "ORDER_MAIN_ID_SEQ", sequenceName = "ORDER_MAIN_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_MAIN_ID_SEQ")
	private Long orderMainId;

	@Column(name = "IS_TAKE_OUT")
	private boolean isTakeOut;

	@Column(name = "TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	public Long getOrderMainId() {
		return orderMainId;
	}

	public void setOrderMainId(Long orderMainId) {
		this.orderMainId = orderMainId;
	}

	public boolean isTakeOut() {
		return isTakeOut;
	}

	public void setTakeOut(boolean takeOut) {
		isTakeOut = takeOut;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
}
