package solid.opencloseprinciple;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ISPSubscriber extends Subscriber{

	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}
}
