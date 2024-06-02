package intlist;

/** Same as IntList but all elements are sorted when added */
public class SortedIntList  extends IntList{

    /** add an element to the list in the correct position so the list will stay sorted
     * @see IntList#add(int)
     * @param element element that will be added
     */
    @Override
    public void add(final int element){
        if(list.size() == 0){
            list.add(element);
        } else {
            int index = 0;
            for(final int ele : list){
                if(ele >= element){ //look for the first Integer ele that is larger than the element we try to add
                    break;
                }
                index++;
            }
            list.add(index, element);
        }
    }

    /**
     * @see IntList#findMin()
     */
    @Override
    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        } else {
            return list.get(0);
        }
    }
}
