package com.israelsantiago.bookstore.orders.web.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.israelsantiago.bookstore.orders.AbstractIT;
import com.israelsantiago.bookstore.orders.WithMockOAuth2User;
import org.junit.jupiter.api.Test;

class GetOrdersTests extends AbstractIT {

    @Test
    @WithMockOAuth2User(username = "user")
    void shouldGetOrdersSuccessfully() throws Exception {
        mockMvc.perform(get("/api/orders")).andExpect(status().isOk());
    }
}
