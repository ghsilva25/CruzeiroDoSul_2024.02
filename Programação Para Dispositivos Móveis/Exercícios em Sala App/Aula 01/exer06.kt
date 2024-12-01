fun main(){


    for(i in 1..10) {
        print("$i...")

    }

    println()

    for(i in 1..100 step 3){

        if(i==7)
            continue

        if(i==31)
            break


        print("$i...")
    }

}