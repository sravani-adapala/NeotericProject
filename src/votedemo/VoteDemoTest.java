package votedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class VoteDemoTest {

    public static void main(String[] args) {

        Predicate<Vote> predicate = (vote) -> vote.status.equals("yes");
        Predicate<Vote> predicate1 = (vote) -> vote.status.equals("no");


        Vote vote = new Vote();
        vote.name = "sravs";
        vote.id = "7891234";
        vote.status = "no";

        Vote vote2 = new Vote();
        vote2.name = "tirru";
        vote2.id = "908076";
        vote2.status = "no";

        Vote vote3 = new Vote();
        vote3.name = "kavya";
        vote3.id = "444444";
        vote3.status = "no";

        Vote vote4 = new Vote();
        vote4.name = "siri";
        vote4.id = "88888";
        vote4.status = "no";

        Vote vote5 = new Vote();
        vote5.name = "swathi";
        vote5.id = "777654";
        vote5.status = "no";

        List<Vote> voteList = new ArrayList<>();

        voteList.add(vote);
        voteList.add(vote2);
        voteList.add(vote3);
        voteList.add(vote4);
        voteList.add(vote5);
        voteList.add(vote);

        VoteService voteService = new VoteService();
        voteService.getvoteStatus(voteList, predicate, predicate1);


    }
}







