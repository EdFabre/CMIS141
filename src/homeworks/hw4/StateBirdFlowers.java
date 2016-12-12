package homeworks.hw4;

/**
 * 
 * @author Ed Fabre
 */
public class StateBirdFlowers {

    private String state;

    /**
     * This constructor takes in the state to be searched and trims white spaces
     * and makes it into lowercase for.
     *
     * @param state
     */
    public StateBirdFlowers(String state) {
        this.state = state.trim().toLowerCase();
    }

    /**
     * This multi-dimensional array holds State, Bird and Flower for all 51
     * states.
     *
     */
    private static String state2DArray[][] = {
        {"Alabama", "Camellia", "Yellowhammer"},
        {"Alaska", "Forget-me-not", "Willow Ptarmigan"},
        {"Arizona", "Saguaro Cactus Blossom", "Cactus Wren"},
        {"Arkansas", "Apple Blossom", "Mockingbird"},
        {"California", "Golden Poppy", "California Valley Quail"},
        {"Colorado", "Columbine", "Lark Bunting"},
        {"Connecticut", "Mountain Laurel", "American Robin"},
        {"Delaware", "Peach Blossom", "Blue Hen Chicken"},
        {"Florida", "Orange Blossom", "Mockingbird"},
        {"Georgia", "Cherokee Rose", "Brown Thrasher"},
        {"Hawaii", "Hibiscus", "Nene (Hawaiian Goose)"},
        {"Idaho", "Syringa", "Mountain Bluebird"},
        {"Illinois", "Native violet", "Cardinal"},
        {"Indiana", "Peony", "Cardinal"},
        {"Iowa", "Wild Rose", "Eastern Goldfinch"},
        {"Kansas", "Native Sunflower", "Western Meadowlark"},
        {"Kentucky", "Goldenrod", "Kentucky Cardinal"},
        {"Louisiana", "Magnolia", "Pelican"},
        {"Maine", "White Pine Cone and Tassel", "Chickadee"},
        {"Maryland", "Black-Eyed Susan", "Baltimore Oriole"},
        {"Massachusetts", "Mayflower", "Chickadee"},
        {"Michigan", "Apple Blossom", "Robin"},
        {"Minnesota", "Pink and White Lady's Slipper", "Common Loon"},
        {"Mississippi", "Magnolia", "Mockingbird"},
        {"Missouri", "Hawthorn", "Bluebird"},
        {"Montana", "Bitterroot", "Western Meadowlark"},
        {"Nebraska", "Goldenrod", "Western Meadowlark"},
        {"Nevada", "Sagebrush", "Mountain Bluebird"},
        {"New Hampshire", "Purple Lilac", "Purple Finch"},
        {"New Jersey", "Purple Violet", "Eastern Goldfinch"},
        {"New Mexico", "Yucca Flower", "Roadrunner"},
        {"New York", "Rose", "Bluebird"},
        {"North Carolina", "Dogwood", "Cardinal"},
        {"North Dakota", "Wild Prairie Rose", "Western Meadowlark"},
        {"Ohio", "Scarlet Carnation", "Cardinal"},
        {"Oklahoma", "Mistletoe", "Scissor-Tailed Flycatcher"},
        {"Oregon", "Oregon Grape", "Western Meadowlark"},
        {"Pennsylvania", "Mountain Laurel", "Ruffed Grouse"},
        {"Rhode Island", "Violet", "Rhode Island Red"},
        {"South Carolina", "Yellow Jessamine", "Carolina Wren"},
        {"South Dakota", "American Pasqueflower", "Ring-Necked Pheasant"},
        {"Tennessee", "Iris", "Mockingbird"},
        {"Texas", "Bluebonnet", "Mockingbird"},
        {"Utah", "Sego Lily", "California Gull"},
        {"Vermont", "Red Clover", "Hermit Thrush"},
        {"Virginia", "Dogwood", "Cardinal"},
        {"Washington", "Western Rhododendron", "Willow Goldfinch"},
        {"West Virginia", "Big Rhododendron", "Cardinal"},
        {"Wisconsin", "Wood Violet", "Robin"},
        {"Wyoming", "Indian Paintbrush", "Meadowlark"},
        {"Washington, D.C.", "American Beauty Rose", "Woodthrush"}
    };

    /**
     * Returns the string representation of states bird and flower using the
     * Java StringBuilder class.
     *
     * @return
     */
    public String getBirdAndFlower() {
        StringBuilder birdAndFlower = new StringBuilder();

        for (int i = 0; i < state2DArray.length; i++) {
            
            // This will check the array for the state.
            if (state.equalsIgnoreCase(state2DArray[i][0])) {
                birdAndFlower
                        .append("Flower: ").append(state2DArray[i][1])
                        .append("\n")
                        .append("Bird: ").append(state2DArray[i][2])
                        .append("\n");
                
                return birdAndFlower.toString();
            }
            
            // This check is to make sure all variations of DC return correctly.
            if (state.contains("dc") 
                    || state.contains("d.c")
                    || state.contains("d,c")
                    || state.contains("district of columbia")) {
                birdAndFlower
                        .append("Flower: ").append(state2DArray[50][1])
                        .append("\n")
                        .append("Bird: ").append(state2DArray[50][2])
                        .append("\n");
                
                return birdAndFlower.toString();
            }
        }
        return "Not a valid State\n" ;
    }
}
