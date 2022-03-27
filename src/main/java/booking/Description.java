package booking;

// Search descriptions of cities (keeping this line for the massive comment)

// Booking.com wants to help travelers to find a destination. For that, we built a data set with a description of a few destinations.

// Given some world cities, with a description about each city, implement a searcher that will return which cities match a given keyword. For example, given city data like:

// cities: {
// "Amsterdam" => "Amsterdam’s intriguing history spans seven centuries. From humble beginnings as a small village to a world power in the 17th century, Amsterdam today is a fascinating mix of history and commerce.",

// "Tel Aviv" => "Tel Aviv, a city on Israel’s Mediterranean coast, is marked by stark 1930s Bauhaus buildings, thousands of which are clustered in the White City architectural area.",

// "Shanghai" => "Shanghai, on China’s central coast, is the country's biggest city and a global financial hub.",

// "Seattle" => "Seattle is surrounded by water, mountains and evergreen forests, and contains thousands of acres of parkland.",

// "Singapore" => "Singapore, an island city-state off southern Malaysia, is a global financial center with a tropical climate and multicultural population."
// }

// For example, searching for "history", "coast" or "mountains" would return which city descriptions match those keywords:

// search("history")    :  [ Amsterdam ]
// search("coast")     : [ Tel Aviv, Shanghai ]
// search("mountains") : [ Seattle ]

//public class Description {
//
//    public List<String> search (String searchWord) {
//
//        List<String> result = new ArrayList<>();
//
//        for (EntrySet.map entry: values) {
//
//            newEntry = entry.remove(",").remove("."); // "Shanghai on China’s central coast is the country's biggest city and a global financial hub.
//            String[] descriptionStrings = newEntry.split(" "); // "Shanghai,on,China’s,central,coast,is,the,country's,biggest,city,and,a,global,financial,hub.
//
//            for (int i = 0; i < descriptionStrings.length(); i++) {
//                if (descriptionStrings[i].equals(searchWord)) {
//                    result.put(EntrySet.map.getKey);
//                }
//            }
//        }
//
//        return result;
//    }
//
//}
