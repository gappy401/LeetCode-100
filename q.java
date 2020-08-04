   HashSet<Integer> predator=new HashSet<>();
    HashSet<Integer> prey=new HashSet<>();
    int n=predators.size();
    for(int i=0;i<n;i++)
    {
        if(predators.get(i)==-1)
        predator.add(i);
    }
    int res=0;
    while(predator.size()!=0)
    {
        for(int i=0;i<n;i++)
        {
            if(predator.contains(predators.get(i)))
            {
                prey.add(i);
            }
        }
        res++;
        predator.clear();
        for(Integer i:prey)
        {
            predator.add(i);

        }
        prey.clear();
    }
    return res;
    
    