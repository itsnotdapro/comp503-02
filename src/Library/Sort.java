package Library;

import java.util.Comparator;

/** Object that can return a Comparator object based on the SortingMethod input of it's get method
 * @author 19076935 */
public class Sort {

	/** Gets a comparator object based on a specified SortingMethod enumeration
	 * @param method The sorting method to use
	 * @return A comparator object with the required overridden compare method
	 * @author 19076935 */
	public static Comparator<Game> get(SortingMethod method) {
		switch(method) {
		case NAME:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g1.getTitle().compareTo(g2.getTitle());
				}
			};
		case PRICE_HIGHEST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return (int)((g2.getPrice() - g1.getPrice()) * 100);
				}
			};
		case PRICE_LOWEST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return (int)((g1.getPrice() - g2.getPrice()) * 100);
				}
			};
		case RELEASE_FIRST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g2.getRelease().compareTo(g1.getRelease());
				}
			};
		case RELEASE_LAST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g1.getRelease().compareTo(g2.getRelease());
				}
			};
		case PURCHASE_FIRST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g2.getPurchase().compareTo(g1.getPurchase());
				}
			};
		case PURCHASE_LAST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g1.getPurchase().compareTo(g2.getPurchase());
				}
			};
		case RATING_LOWEST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g1.getRating() - g2.getRating();
				}
			};
		case RATING_HIGHEST:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return g2.getRating() - g1.getRating();
				}
			};
		case DEVELOPER:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return ((String)g1.getResult("developers")).compareTo((String)g2.getResult("developers"));
				}
			};
		
		case METACRITIC:
			return new Comparator<Game>() {
				@Override
				public int compare(Game g1, Game g2) {
					return (int)g2.getResult("score") - (int)g1.getResult("score");
				}
			};
		}
		return null;
	}
}
