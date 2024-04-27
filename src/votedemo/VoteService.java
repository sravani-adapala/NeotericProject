package votedemo;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class VoteService {
    public void getvoteStatus(List<Vote> voteList, Predicate<Vote> predicate , Predicate<Vote> predicate1){

        Iterator<Vote> iterator=voteList.iterator();
        for (; iterator.hasNext();){
            Vote vote= iterator.next();
            if (predicate.test(vote)){

                System.out.println("your not eligible for vote:" + vote.id);
            }
            if (predicate1.test(vote)){
                vote.status="yes";
                System.out.println("your are eligible for vote:" + vote.id);

            }

        }

    }
}
