package com.citas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppointmentSystem implements Command {
	
	@Override
	public List<Appointment> seeDates(String clientId) 
	{
		List<Appointment> appointments = new ArrayList<Appointment>();
		try(BufferedReader br = new BufferedReader(new FileReader("../Citas/" + clientId))) {
			String line;
			Appointment a;
			while((line = br.readLine()) != null) {
				String[] data  = line.split(",");
				a = new Appointment(data[0], data[1]);
				appointments.add(a);
			}
		} catch (FileNotFoundException e) {
			System.out.println("El DNI seleccionado no se encuentra registrado");
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		return appointments;
	}

	// MODIFICARLO PARA QUE CUANDO ENCUENTRE EL DATETIME QUE NECESITAMOS SE LO SALTE
	// EL METODO LO QUE HARA ES ESCRIBIR LINEA POR LINEA SEGUN LEE ASI QUE LA FUNCION
	// DE COMPARACION EN PRINCIPIO SE MANTIENE
	@Override
	public Boolean removeDate(String clientId, String dateTime) {
		try(BufferedReader br = new BufferedReader(new FileReader("../Citas/" + clientId))) {
			String line;
			while((line = br.readLine()) != null)
			{
				String[] data = line.split(",");
				if(dateTime == data[0])
				{
				
				}
			}
		} catch(FileNotFoundException e)
		{
			System.out.println("No se puede eliminar, el cliente no existe");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean addDate(Appointment appointment) {
		return null;
	}
}
