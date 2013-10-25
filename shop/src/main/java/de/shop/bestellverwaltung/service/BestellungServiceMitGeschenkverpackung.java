package de.shop.bestellverwaltung.service;

import java.lang.invoke.MethodHandles;
import java.util.List;



import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import de.shop.artikelverwaltung.domain.Artikel;
import de.shop.bestellverwaltung.domain.Bestellung;
import de.shop.kundenverwaltung.domain.AbstractKunde;

@Decorator
@Dependent
public abstract class BestellungServiceMitGeschenkverpackung implements BestellungService {
	private static final Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass());
	
	@Inject
	@Delegate
	@Any
	private BestellungService bs;

	@Override
	public Bestellung findBestellungById(Long id) {
		return bs.findBestellungById(id);
	}

	@Override
	public Bestellung findBestellungByIdMitLieferungen(Long id) {
		return bs.findBestellungByIdMitLieferungen(id);
	}

	@Override
	public AbstractKunde findKundeById(Long id) {
		return bs.findKundeById(id);
	}

	@Override
	public List<Bestellung> findBestellungenByKunde(AbstractKunde kunde) {
		return bs.findBestellungenByKunde(kunde);
	}

	@Override
	public Bestellung createBestellung(Bestellung bestellung, Long kundeId) {
		LOGGER.warn("Geschenkverpackung noch nicht implementiert");
		
		return bs.createBestellung(bestellung, kundeId);
	}
	
	@Override
	public Bestellung createBestellung(Bestellung bestellung, AbstractKunde kunde) {
		LOGGER.warn("Geschenkverpackung noch nicht implementiert");
		
		return bs.createBestellung(bestellung, kunde);
	}

	@Override
	public List<Artikel> ladenhueter(int anzahl) {
		return bs.ladenhueter(anzahl);
	}

	/*@Override
	public List<Lieferung> findLieferungen(String nr) {
		return bs.findLieferungen(nr);
	}

	@Override
	public Lieferung createLieferung(Lieferung lieferung,
			List<Bestellung> bestellungen) {
		return bs.createLieferung(lieferung, bestellungen);
	}*/

}
