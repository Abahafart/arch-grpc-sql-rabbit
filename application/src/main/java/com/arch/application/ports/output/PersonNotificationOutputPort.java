package com.arch.application.ports.output;

import com.arch.domain.PersonDO;

public interface PersonNotificationOutputPort {

  void sendNotification(PersonDO personDO);

}
