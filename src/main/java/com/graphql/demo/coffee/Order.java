/**
 * 
 */
package com.graphql.demo.coffee;

import java.time.OffsetDateTime;

/**
 * @author Gbenga
 *
 */
public record Order(Integer orderId, Coffee coffee, User user, OffsetDateTime orderedOn) {}