import java.util.Collections;
import java.util.Vector;

public class Scan {






        static int disk_size = 200;

        static void SCAN(int input[], int head, String direction)
        {
            int seek_cou = 0;
            int distance, cur_track;
            Vector<Integer> leftmove = new Vector<Integer>(),
                    rightmove = new Vector<Integer>();
            Vector<Integer> seek_sequence = new Vector<Integer>();

            // appending end values

            if (direction == "left")
                leftmove.add(0);
            else if (direction == "right")
                rightmove.add(disk_size - 1);

            for (int i = 0; i < 8; i++)
            {
                if (input[i] < head)
                    leftmove.add(input[i]);
                if (input[i] > head)
                    rightmove.add(input[i]);
            }

            // sorting left and right vectors
            Collections.sort(leftmove);
            Collections.sort(rightmove);


            // one by one scanning right
            // and left of the head
            int runLoop = 2;
            while (runLoop-- >0)
            {
                if (direction == "left")
                {
                    for (int i = leftmove.size() - 1; i >= 0; i--)
                    {
                        cur_track = leftmove.get(i);

                        // appending current track to seek sequence
                        seek_sequence.add(cur_track);

                        // calculate absolute distance
                        distance = Math.abs(cur_track - head);

                        // increase the total count
                        seek_cou += distance;

                        // accessed track is now the new head
                        head = cur_track;
                    }
                    direction = "right";
                }
                else if (direction == "right")
                {
                    for (int i = 0; i < rightmove.size(); i++)
                    {
                        cur_track = rightmove.get(i);

                        // appending current track to seek sequence
                        seek_sequence.add(cur_track);

                        // calculate absolute distance
                        distance = Math.abs(cur_track - head);

                        // increase the total count
                        seek_cou += distance;

                        // accessed track is now new head
                        head = cur_track;
                    }
                    direction = "left";
                }
            }

            System.out.print("Total number of seek operations = "
                    + seek_cou + "\n");

            System.out.print("Seek Sequence is" + "\n");

            for (int i = 0; i < seek_sequence.size(); i++)
            {
                System.out.print(seek_sequence.get(i) + "\n");
            }
        }


        public static void main(String[] args)
        {

            // request array
            int arr[] = { 122, 68, 23, 59, 81, 11, 51, 124 };
            int head = 50;
            String direction = "left";

            SCAN(arr, head, direction);
        }
    }




