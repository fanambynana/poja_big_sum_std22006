package com.poja_big_sum_std22006.base.endpoint.rest.controller;

import static com.poja_big_sum_std22006.base.endpoint.rest.controller.health.PingController.OK;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.poja_big_sum_std22006.base.PojaGenerated;
import com.poja_big_sum_std22006.base.conf.FacadeIT;
import com.poja_big_sum_std22006.base.endpoint.rest.controller.health.HealthDbController;
import com.poja_big_sum_std22006.base.endpoint.rest.controller.health.PingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@PojaGenerated
class HealthControllerIT extends FacadeIT {

  @Autowired PingController pingController;
  @Autowired HealthDbController healthDbController;

  @Test
  void ping() {
    assertEquals("pong", pingController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var responseEntity = healthDbController.dummyTable_should_not_be_empty();
    assertEquals(OK, responseEntity);
  }
}
