package com.adyen.service.resource.notification;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Arrays;


public class DeleteNotificationConfigurations extends Resource {

    public DeleteNotificationConfigurations(Service service) {
        super(service,
              service.getClient().getConfig().getMarketPayEndpoint() + "/Notification/" + Client.MARKETPAY_API_VERSION + "/deleteNotificationConfigurations",
              Arrays.asList(
                      "notificationIds"
              )
        );
    }
}
