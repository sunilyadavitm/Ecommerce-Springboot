package com.sl.Sunil.Eccormerce.service.interf;

import com.sl.Sunil.Eccormerce.dto.OrderRequest;
import com.sl.Sunil.Eccormerce.dto.Response;
import com.sl.Sunil.Eccormerce.enums.OrderStatus;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
