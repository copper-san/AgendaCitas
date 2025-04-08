package com.citas;

import java.util.List;

public interface Command {

	List<Appointment> seeDates(String clientId);
	Boolean removeDate(String clientId, String dateTime);
	Boolean addDate(Appointment appointment);
}
